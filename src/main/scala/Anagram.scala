object Anagram:
   def findAnagrams(target: String, candidates: List[String]): List[String] = {
      candidates.filter(c => c.toLowerCase != target.toLowerCase && c.toLowerCase.permutations.contains(target.toLowerCase))
   }