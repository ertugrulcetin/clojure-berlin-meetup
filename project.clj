(defproject clojure-berlin-meetup "0.1.0-SNAPSHOT"

  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clojurecademy "0.1.0"]]

  ;;lein-clojurecademy 0.1.55
  :plugins [[clojurecademy/clojurecademy "0.1.0"]]

  :eval-in :leiningen

  :clojurecademy {:course-map clojure-berlin-meetup.core/course-map})
