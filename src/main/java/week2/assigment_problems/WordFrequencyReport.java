import java.util.*;
public class WordFrequencyReport {
 static void printFilteredWordFrequency(String feedback) {
  String[] stopWords={"the","was","and","a","is","of","in"}; Set<String> stopSet=new HashSet<>();
  for(String word:stopWords)stopSet.add(word);
  String cleaned=feedback.toLowerCase().replaceAll("[.,!?;:]",""); String[] words=cleaned.trim().split("\\s+"); Map<String,Integer> frequency=new HashMap<>();
  for(String word:words)if(!word.isEmpty()&&!stopSet.contains(word))frequency.put(word,frequency.getOrDefault(word,0)+1);
  List<Map.Entry<String,Integer>> entries=new ArrayList<>(frequency.entrySet());
  entries.sort(Comparator.comparingInt((Map.Entry<String,Integer> e)->e.getValue()).reversed());
  for(Map.Entry<String,Integer> entry:entries)System.out.println(entry.getKey()+": "+entry.getValue());
 }
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter feedback paragraph: "); String feedback=sc.nextLine(); printFilteredWordFrequency(feedback); sc.close(); }
}