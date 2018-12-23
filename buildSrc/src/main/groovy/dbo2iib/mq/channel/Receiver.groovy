package dbo2iib.mq.channel

class Receiver implements Channel {
    String name

    Receiver(name) {
        this.name = name
    }

    @Override
    String[] generate() {
        return "DEFINE CHANNEL(" + name + ") CHLTYPE(RCVR) TRPTYPE(TCP)"
    }
}
