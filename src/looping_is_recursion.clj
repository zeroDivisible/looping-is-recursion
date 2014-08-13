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
  (cond
    (and (empty? seq1) (empty? seq2)) true
    (or (empty? seq1) (empty? seq2)) false
    (not= (first seq1) (first seq2)) false
    :else (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  (loop [i 0
         f pred
         coll a-seq]
    (cond
      (empty? coll) nil
      (f (first coll)) i
      :else (recur (inc i) pred (rest coll)))))

(defn avg [a-seq]
  (loop [c 0
         s 0
         coll a-seq]
    (cond
      (empty? coll) (/ s c)
      :else (recur (inc c) (+ s (first coll)) (rest coll)))))

(defn toggle [a-set elem]
  (if
    (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (loop [output-coll #{}
         input-coll a-seq]
    (cond
      (empty? input-coll) output-coll
      :else (recur (toggle output-coll (first input-coll)) (rest input-coll)))))

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

