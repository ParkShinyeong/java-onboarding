package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<String> userFriends = getUserFriends(user, friends);
        HashMap<String, Integer> listOfScore = new HashMap<>();
        getAcquaintance(user, listOfScore, userFriends, friends);
        getVisitorScore(listOfScore, visitors, userFriends);
        List<Map.Entry<String, Integer>> sortedListOfScore = getSortedListOfScore(listOfScore);
        answer = getTopFive(sortedListOfScore);
        return answer;
    }

    public static List<String> getUserFriends(String user, List<List<String>> friends) {
        List<String> userFriends = new ArrayList<>();
        for (List<String> friend: friends) {
            String user1 = friend.get(0);
            String user2 = friend.get(1);

            if(user1.equals(user)) {
                userFriends.add(user2);
                continue;
            }
            if (user2.equals(user)) {
                userFriends.add(user1);
            }
        }
        return userFriends;
    }

    public static void getAcquaintance (String user, HashMap<String, Integer> listOfScore, List<String> userFriends, List<List<String>> friends) {
        final int acquaintanceScore = 10;
        for (String friendId: userFriends) {
            List<String> acquaintanceList = getUserFriends(friendId, friends);
            for (String acquaintance: acquaintanceList) {
                if(!acquaintance.equals(user) && !userFriends.contains(acquaintance)) {
                    setScore(listOfScore, acquaintance, acquaintanceScore);
                }
            }
        }
    }

    public static void getVisitorScore (HashMap<String, Integer> listOfScore, List<String> visitors, List<String> userFriends) {
        final int visitorScore = 1;
        for(String visitor: visitors) {
            if(!userFriends.contains(visitor)) {
                setScore(listOfScore, visitor, visitorScore);
            }
        }
    }

    public static void setScore (HashMap<String, Integer> listOfScore, String userId, Integer score){
        listOfScore.put(userId, listOfScore.getOrDefault(userId, 0) + score);
    }

    public static List<Map.Entry<String, Integer>>  getSortedListOfScore(HashMap<String, Integer> listOfScore) {
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(listOfScore.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> user1, Map.Entry<String, Integer> user2) {
                if (Objects.equals(user2.getValue(), user1.getValue())) {
                    return sortedWithKey(user1, user2);
                }
                return user2.getValue() - user1.getValue();
            }
        });

        return entryList;
    }

    public static Integer sortedWithKey(Map.Entry<String, Integer> user1, Map.Entry<String, Integer> user2) {
        String user1Key = user1.getKey();
        String user2Key = user2.getKey();
        int n = 0;
        while (n < Math.min(user1Key.length(), user2Key.length())&& user1Key.charAt(n) == user2Key.charAt(n)) {
            n++;
        }
        return user1Key.charAt(n) - user2Key.charAt(n);
    }

    public static List<String> getTopFive(List<Map.Entry<String, Integer>> entryList) {
        List<String> recommendList = new ArrayList<>();
        int numOfPeople = Math.min(entryList.size(), 5);
        for(int i = 0; i < numOfPeople; i++) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            recommendList.add(entry.getKey());
        }

        return recommendList;
    }
}
