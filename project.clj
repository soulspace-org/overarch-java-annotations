(defproject org.soulspace/overarch-java-annotations "0.1.1"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :java-source-paths ["src/main/java"]
  :java-resource-paths ["src/main/resources"]
  :java-test-paths ["src/test/java"]

  :scm {:name "git" :url "https://github.com/soulspace-org/overarch-java-annotations"}
  :deploy-repositories [["clojars" {:sign-releases false :url "https://clojars.org/repo"}]])