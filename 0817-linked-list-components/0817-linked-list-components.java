class Solution {
    public int numComponents(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int s : nums) {
            set.add(s);
        }

        int groups= 0;
        ListNode present = head;

        while (present != null) {

            if (set.contains(present.val) &&
                (present.next == null ||
                 !set.contains(present.next.val))) {

                groups++;
            }

            present = present.next;
        }

        return groups;
    }
}