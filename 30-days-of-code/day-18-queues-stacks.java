class Palindrome {
    List<Character> queue;
    ArrayDeque<Character> stack;
    Palindrome() {
        queue = new ArrayList<>();
        stack = new ArrayDeque<>();
    }
    void pushCharacter(char ch) {
        stack.push(ch);
    }
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    char popCharacter() {
        return stack.pop();
    }
    char dequeueCharacter() {
        return queue.remove(0);
    }
}
