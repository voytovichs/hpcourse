package handlers.requests

import communication.CommunicationProtos


interface RequestExecutor {
    fun execute(request: CommunicationProtos.ServerRequest): CommunicationProtos.ServerResponse
}