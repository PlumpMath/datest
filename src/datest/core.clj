(ns datest.core)

(comment
  (require '[datomic.api :as d])
  (def db-uri "datomic:dev://localhost:4334/hello")

  (d/create-database db-uri)
  (def conn (d/connect db-uri))
  )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
