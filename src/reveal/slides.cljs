(ns reveal.slides)

(def intro
  [:section
   [:img {:src "https://my.datomic.com/img/logo-clean.png"}]
   [:h1 "Datomic"]
   [:p "5 reasons you should care"]])

(def what-is-datomic?
  [:section
   [:section
    [:h2 "What is Datomic?"]]
   [:section
    [:ul
     [:li "Immutable"]
     [:li "Datalog"]
     [:li "Scalable Reads"]
     [:li "Single Threaded Writes"]]]])

(def history
  [:section
   [:h2 "History"]
   [:ul
    [:li "Auditing"]
    [:li "Querying"]
    [:li "Reproducability"]]])

(def scalability
  [:section
   [:h2 "Scalability"]
   [:ul
    [:li "Batch Processes"]
    [:li "Traffic spikes"]]])

(def flexible-data-modelling
  [:section
   [:h2 "Flexible Data Model"]])

(def better-query-language
  [:section
   [:h2 "A Better Query Language"]])

(def )

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [intro
   what-is-datomic?
   history
   scalability])
