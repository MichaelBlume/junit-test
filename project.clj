(defproject junit-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles  {:dev  {:dependencies  [[junit/junit "4.11"]]}}
  :plugins  [[lein-junit "1.1.7"]]
  :java-source-paths  ["src/java" "test/java"]
  :junit  ["test/java"]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :dependencies [[org.clojure/clojure "1.6.0"]])
