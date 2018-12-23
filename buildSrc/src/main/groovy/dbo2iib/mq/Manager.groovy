package dbo2iib.mq

import dbo2iib.mq.channel.Channel
import dbo2iib.mq.queue.Queue

class Manager {
    String name
    String host
    int port
    Grant[] grants
    Queue[] queues
    Channel[] channels
}
