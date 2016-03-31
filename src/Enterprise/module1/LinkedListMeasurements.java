package Enterprise.module1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

class LinkedListMeasurements extends MainFirstEEmodule { //наследование от мейна - ну очень странная штука
    //мейн - это всегда отдельный класс, который отвечает только за запуск программы. Считай, что это сторона клиента.

    private long[][] measurementsLinkedList = new long[7][NUMBER_OF_TESTS];//снова меджик намбер
    private long[] resultTimersLinkedList = new long[7];

    private LinkedList<Integer> linkedList = new LinkedList<>();

    void Initialisation(int size) { //логичней этот метод сделать паблик

        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        MeasurementsLinkedList();

        temp = CalculateLinkedListTimers();
    }

    private long[] CalculateLinkedListTimers() { //имя метода с маленькой буквы
        long res = measurementsLinkedList[0][0];

        for (int j = 0; j < measurementsLinkedList.length; j++) {    //7
            for (int i = 1; i < NUMBER_OF_TESTS; i++) {         //100

                res += measurementsLinkedList[j][i];
            }
            resultTimersLinkedList[j] = res / NUMBER_OF_TESTS;
        }
        return resultTimersLinkedList;
    }

    long[] getResultTimersLinkedList() { //геттеры всегда паблик
        return resultTimersLinkedList;
    }

    private void MeasurementsLinkedList() { //название метода должно начинаться с маленькой буквы и глагола
        Random randomNumber = new Random();
        for (int i = 0; i < NUMBER_OF_TESTS; i++) {

            int rnd = randomNumber.nextInt(linkedList.size() + 1);

            long timerAdd = System.nanoTime();
            linkedList.add(rnd);
            measurementsLinkedList[0][i] = System.nanoTime() - timerAdd;

            long timerGet = System.nanoTime();
            linkedList.get(rnd);
            measurementsLinkedList[1][i] = System.nanoTime() - timerGet;

            long timerRemove = System.nanoTime();
            linkedList.remove(rnd);
            measurementsLinkedList[2][i] = System.nanoTime() - timerRemove;

            long timerContains = System.nanoTime();
            linkedList.contains(rnd);
            measurementsLinkedList[3][i] = System.nanoTime() - timerContains;

            long timerPopulate = System.nanoTime();
            List<Integer> newLinkedList = new LinkedList<Integer>(linkedList); //никогда не используется
            measurementsLinkedList[4][i] = System.nanoTime() - timerPopulate;

            long timerIterAdd = System.nanoTime();
            ListIterator<Integer> iterator = linkedList.listIterator();
            iterator.next();
            iterator.add(rnd);

            measurementsLinkedList[5][i] = System.nanoTime() - timerIterAdd;

            long timerIterRemove = System.nanoTime();
            iterator = linkedList.listIterator();
            iterator.next();
            iterator.remove();

            measurementsLinkedList[6][i] = System.nanoTime() - timerIterRemove;
        }
    }


}


