package com.savload;

/**
 * @author shili
 * @Classname _2_AddTwoNumbers
 * @Date 2021/7/28 17:41
 * @Description 两数相加
 */
public class _2_AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode nextNode = listNode;
        while (true) {

            int val = listNode.val;

            if (null != l1) {
                val = val + l1.val;
            }
            if (null != l2) {
                val = val + l2.val;
            }
            if (val >= 10) {
                val = val - 10;
                listNode.next = new ListNode(1);
            }
            listNode.val = val;

            if (null != l1) {
                l1 = l1.next;
            } else {
                l1 = null;
            }
            if (null != l2) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
            if (null != l1 || null != l2) {
                if (null == listNode.next) {
                    listNode.next = new ListNode();
                }
            }

            listNode = listNode.next;

            if (null == l1 && null == l2) {
                break;
            }
        }

        return nextNode;
    }
}
