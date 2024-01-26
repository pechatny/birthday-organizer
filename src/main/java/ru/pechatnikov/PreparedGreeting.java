package ru.pechatnikov;

import java.util.List;

record PreparedGreeting(List<String> participants, List<String> poemLines) {
    public String toString() {
        if (participants.size() != poemLines.size()) throw new IllegalArgumentException();
        StringBuilder buffer = new StringBuilder();
        var participantIterator = participants.iterator();
        var poemIterator = poemLines.iterator();
        var counter = 0;

        while (participantIterator.hasNext() && poemIterator.hasNext()) {
            buffer.append(++counter).append(". ");
            buffer.append(participantIterator.next());
            buffer.append("\r\n");
            buffer.append(poemIterator.next());
            buffer.append("\r\n");
        }

        return buffer.toString();

    }
}
