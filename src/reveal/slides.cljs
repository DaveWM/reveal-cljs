(ns reveal.slides
  (:require [zprint.core :as zp]))

(def intro
  [:section
   [:img {:src "https://my.datomic.com/img/logo-clean.png"}]
   [:h1 "Datomic"]
   [:p "Why should I care?"]])

(def what-is-datomic?
  [:section
   [:h2 "What is Datomic?"]
   [:ul
    [:li "A functional, immutable database"]
    [:li "Datalog query language"]
    [:li "Separate read and write APIs"]
    [:li "Transactional"]]])

(def time-travel
  [:section
   [:section
    [:h2 "Time Travel"]
    [:img {:src "https://vagonettasblog.files.wordpress.com/2015/08/f50bb-hackerman-el-kaker-vagonettas-06.gif"}]]
   [:section
    [:h2 "\uD83D\uDE31 -> \uD83D\uDE0E"]
    [:p [:i "I had a problem this morning, but it's working now. What happened?"]]
    [:p [:i "My report's giving me different figures to yesterday, why?"]]
    [:p [:i "The customer wants us to re-print his invoice from 6 months ago, but we've amended some of the charges"]]]])

(def scalability
  [:section
   [:section
    [:h2 "Scalability"]
    [:ul
     [:li "Reads are infinitely scalable"]
     [:li "Lots of caching - no N+1 problem"]]]
   #_[:section
      [:p [:i "Don't run that report during work hours, it slows down the DB"]]
      [:p [:i "We can speed that up using caching - but it'll take a while to write the caching code"]]
      [:p [:i "The DB is a bit slow at the moment, there's a lot of traffic"]]]])

(def data-modelling
  [:section
   [:section
    [:h2 "Flexible Data Modelling"]
    [:ul
     [:li "Based on Datoms:"
      [:ul
       [:li "E - entity id"]
       [:li "A - attribute"]
       [:li "V - value"]
       [:li "T - transaction"]]]
     [:li "Graph or relational"]
     [:li "Entities can have any attributes"]
     [:li "Datoms can reference one/multiple other Datoms"]]]
   [:section
    [:img {:src "/modelling.png"
           :style "border: none; background: transparent;"}]]
   #_[:section
      [:pre
       [:code {:data-trim true
               :data-noescape true}
        (zp/zprint-str
          '(def schema
             [{:db/ident :person/name
               :db/valueType :db.type/string
               :db/cardinality :db.cardinality/one}
              {:db/ident :employee/role
               :db/valueType :db.type/string
               :db/cardinality :db.cardinality/one}
              {:db/ident :customer/email
               :db/valueType :db.type/string
               :db/cardinality :db.cardinality/one}]))]]]])

(def query-language
  [:section
   [:section
    [:h2 "Datalog Query Language"]
    [:ul
     [:li "Logic based"]
     [:li "Data structures, not strings"]
     [:li "Reusable rules"]
     [:li "Recursive queries \uD83D\uDE4C"]
     [:li "Use arbitrary functions in queries"]]]
   [:section
    [:pre
     [:code
      (str
        "[:find ?name
 :where [?e :person/name ?name]
        [?e :employee/role \"developer\"]]")]]]])

(def bonus
  [:section
   [:h2 "Other Goodies"]
   [:ul
    [:li "Easy horizontal read scalability"]
    [:li "No N+1 problem"]
    [:li "No cache invalidation"]
    [:li "Guaranteed consistent query results"]]])

(def end
  [:section
   [:h2 "Thank you"]])


(defn all
  "Add here all slides you want to see in your presentation."
  []
  [intro
   what-is-datomic?
   time-travel
   data-modelling
   query-language
   bonus
   end])
