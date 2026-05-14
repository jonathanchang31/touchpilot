# OpenAI-Compatible Provider Example

TouchPilot should begin with a simple OpenAI-compatible provider interface.

Required settings:

- `base_url`
- `api_key`
- `model`

The agent runtime should treat provider output as untrusted. Structured tool
calls must be parsed, validated, and policy-checked before execution.

The current MVP uses JSON commands in the assistant message content instead of
native provider-specific function-calling APIs. This keeps the first loop
compatible with more OpenAI-style endpoints.
