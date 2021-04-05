(ns user)

(require '[datomic.client.api :as d])
(require '[schema-cartographer.core :as cartographer])

(def client (d/client {:server-type :peer-server
                       :secret "mysecret"
                       :access-key "myaccesskey"
                       :endpoint "localhost:8998"
                       :validate-hostnames false}))

(def conn (d/connect client {:db-name "stock"}))

(def db (d/db conn))

(cartographer/save-explore-schema-edn db "resources/db-schema.edn" 2000000)

