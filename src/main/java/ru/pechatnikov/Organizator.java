package ru.pechatnikov;

public class Organizator {
    String participants = """
                Артем Завалко
                Эдуард Мисник
                Maksim Hryhoryeu
                Филин• ( Владимир Полин ) 65
                Sergey Agafonov
                Дмитрий Яньков
                Дмитрий Печатников
                Наиль Хакимов
                Арсений Колягин
                Людмила
                Дмитрий Кривичанин
                Денис Султанов
            """;
    String poem = """
            И брутальность, и закалка,
            И осанка, и смекала,
            Сила, мужество и честь —
            Все в тебе, конечно, есть.
                       
            Пожелать тебе осталось
            Незначительную малость.
            В личной жизни — понимания
            И поддержки — в начинаниях.
                       
            В доброй дружбе — уважения,
            А в карьере — продвижения.
            Быть счастливым и довольным,
            Дорогим, но все же вольным,
                       
            При деньгах и в настроении.
            Поздравляем с днем рождения! 
            """;

    public void organize() {
        ParticipantsSplitter participantSplitter = new ParticipantsSplitter();

        var greeting = participantSplitter.splitParticipants(participants, poem);

        System.out.println(greeting);
    }

}
