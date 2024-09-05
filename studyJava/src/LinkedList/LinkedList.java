package LinkedList;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;

    // 연결 리스트 생성
    public LinkedList() {
        this.head = null;
    }

    // 리스트의 끝에 노드 추가
    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 노드 삭제 (값을 기준으로)
    public void delete(int value) {
        if (head == null) return;

        // 헤드 노드가 삭제할 노드인 경우
        if (head.value == value) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // 리스트 출력
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 테스트 메인 메서드
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("리스트 출력:");
        list.printList();

        System.out.println("노드 삭제 후:");
        list.delete(3);
        list.printList();
    }
}

