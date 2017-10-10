(ns clojure-berlin-meetup.core
  (:require [clojurecademy.dsl.core :refer :all]))


(def course-manifest (manifest :title "Clojure Berlin Meetup"
                               :report-bug-email-or-link "https://github.com/ertugrulcetin/clojure-berlin-meetup/issues"
                               :name 'clojure-berlin-meetup
                               :skip? true
                               :short-description "Course for Cool Clojure Berlin Developers"
                               :long-description "I need to write long description here but I'm too lazy...."
                               :who-is-this-course-for :no-programming-experience))



(def course-map
  (course course-manifest
          (chapter 'ch-intro-clojure
                   "Introduction to Clojure"

                   (sub-chapter 'sub-ch-clojure-basics
                                "Clojure Basics"

                                (subject 'what-is-clojure?
                                         "What is Clojure?"

                                         (learn
                                           (text
                                             (p "Clojure is a " (italic "dynamic") ", " (italic "general-purpose")
                                                (str " programming language, combining the approachability"
                                                     " and interactive development of a scripting language with an"
                                                     " efficient and robust infrastructure for ")
                                                (bold "multithreaded programming") ".")

                                             (p "Clojure shares with Lisp the " (hi "code-as-data") " philosophy"
                                                (link "(homoiconicity)" "https://en.wikipedia.org/wiki/Homoiconicity") " and a powerful "
                                                (bold "macro system") ".")

                                             (p "Here is a Hello World program in Clojure:")
                                             (code (println "Hello, World")))))

                                (subject 'subj-lets-do-some-math
                                         "Let's do some math"
                                         (learn
                                           (text
                                             (p "We are going to evaluate some math expressions please follow the instructions below.")))

                                         (instruction 'ins-math-operations
                                                      (run-pre-tests? true)
                                                      (initial-code :none)
                                                      (rule :no-rule? true)

                                                      (sub-instruction 'sub-ins-addition
                                                                       (text
                                                                         (p "Please write a function called " (hi "my-add")
                                                                            " which takes 2 arguments and adds those arguments.")
                                                                         (code "(my-add 1 2)\n;;=> 3"))
                                                                       (testing
                                                                         (is (= (my-add 1 2) 3) :default :advanced)
                                                                         (is (= (my-add 0 0) 0) :default :advanced)
                                                                         (is (= (my-add 55 5) 60) :default :advanced))))
                                         'math-operations)))))