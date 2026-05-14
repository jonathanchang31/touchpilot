package dev.touchpilot.app.agent

data class ProviderConfig(
    val baseUrl: String,
    val apiKey: String,
    val model: String
)

data class AgentCommand(
    val tool: String?,
    val args: Map<String, String>,
    val finalAnswer: String?
)

data class AgentRunResult(
    val transcript: String,
    val finalAnswer: String?
)
