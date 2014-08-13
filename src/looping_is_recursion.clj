(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc base exp]
                 (if
                   (zero? exp)
                   acc
                   (recur (* acc base) base (dec exp))))]
    (helper 1 base exp)))

(defn last-element [a-seq]
  (let [helper (fn [elem a-seq]
                 (if
                   (empty? a-seq)
                   elem
                   (recur (first a-seq) (rest a-seq))))]
    (helper (first a-seq) (rest a-seq))))

(defn seq= [seq1 seq2]
  (let [helper (fn [seq1 seq2]
                 (if
                   (and (empty? seq1) (empty? seq2))
                   true
                   (if
                     (or
                       (and (empty? seq1) (not (empty? seq2)))
                       (and (empty? seq2) (not (empty? seq1))))
                     false
                     (let [f1 (first seq1)
                           f2 (first seq2)]
                       (if
                         (= f1 f2)
                         (recur (rest seq1) (rest seq2))
                         false)))))]
    (helper seq1 seq2)))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

