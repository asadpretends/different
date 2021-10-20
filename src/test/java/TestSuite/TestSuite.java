package TestSuite;

import ArrayCases.ArrayDeletionTesting;
import ArrayCases.ArrayInsertionTest;
import ArrayCases.FullArrayTesting;
import ArrayListCases.ArrayListCases;
import DoublyLinkedListImplementation.DoublyLinkedListImplementationCases;
import DoublyLinkedListCases.DoublyLinkedListCases;
import LinkedListTesting.CircularLinkedListCases;
import LinkedListTesting.LinkedListmplementCases;
import LinkedListTesting.LinkedListSwapNodesCases;
import LinkedListTesting.LinkedListTest;
import PriorityQueueCases.PriorityQueueTest;
import QueueCases.DequeueTest;
import QueueCases.QueueImplementationTest;
import QueueCases.QueueTest;
import QueueCases.QueueLinkedListTest;
import StackCases.MyStackCases;
import StackCases.StackTest;
import StackCases.StackLinkedListCases;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ArrayDeletionTesting.class, ArrayInsertionTest.class, FullArrayTesting.class, ArrayListCases.class,
        DoublyLinkedListCases.class, DoublyLinkedListImplementationCases.class,
        CircularLinkedListCases.class, DoublyLinkedListImplementationCases.class, LinkedListSwapNodesCases.class,
        LinkedListTest.class, PriorityQueueTest.class, DequeueTest.class, QueueTest.class,
        QueueImplementationTest.class, QueueLinkedListTest.class, MyStackCases.class, StackLinkedListCases.class,
        StackTest.class})
public class TestSuite{
}