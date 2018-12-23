package dbo2iib.mq.queue

class TransmitQueue implements Queue {
    String channel, name

    TransmitQueue(name, channel) {
        this.name = name
        this.channel = channel
    }

    String generate() {
        return "DEFINE QLOCAL(" + name + ") TRIGGER INITQ(SYSTEM.CHANNEL.INITQ) USAGE(XMITQ) TRIGDATA(" + channel + ")"
    }
}
