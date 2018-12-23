package dbo2iib.mq.channel

import dbo2iib.mq.queue.TransmitQueue

class Sender implements Channel {
    String name, conname
    TransmitQueue xmitq

    Sender(name, conname, xmitq) {
        this.name = name
        this.conname = conname
        this.xmitq = xmitq
    }

    @Override
    String[] generate() {
        return [xmitq.generate(), "DEFINE CHANNEL(" + name + ") CHLTYPE(SDR) CONNAME('" + conname + "') TRPTYPE(TCP) XMITQ(" + xmitq.name + ")"]
    }
}
