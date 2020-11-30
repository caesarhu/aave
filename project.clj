(defproject caesarhu/aave "0.1.0"
  :description "forked from https://github.com/tekacs/aave.git"
  :url "https://github.com/caesarhu/aave.git"
  :license {:name "Apache License, Version 2.0."
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[metosin/malli "0.2.1"]]
  :source-paths ["src"]
  :profiles
  {:dev  [:project/dev :profiles/dev]
   :repl {:prep-tasks   ^:replace ["javac" "compile"]
          :repl-options {:init-ns user}}
   :uberjar {:aot :all}
   :profiles/dev {}
   :project/dev  {:dependencies   [[lambdaisland/kaocha "1.0.732"]
                                   [lambdaisland/kaocha-cljs "0.0-71"]]}})