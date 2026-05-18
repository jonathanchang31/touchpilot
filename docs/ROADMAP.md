# Roadmap

## Phase 0: Android Control Spike

- [x] Create native Android app shell.
- [x] Add AccessibilityService permission flow.
- [x] Serialize current UI tree.
- [x] Execute tap, type, back, and home from a debug screen.
- [x] Add scroll action.
- [x] Add local tool execution log.
- [x] Add app launching by package or label.
- [x] Add wait-for-text UI synchronization.

## Phase 1: Agent MVP

- [x] Add basic agent task UI.
- [x] Add OpenAI-compatible provider config.
- [x] Add structured JSON command loop.
- [x] Route model-selected tools through the local tool executor.
- [x] Add tool-call timeline and local logs.
- [x] Add manual approval for medium/high risk tools.
- [x] Add Keystore-backed API key storage.
- [x] Add basic tool argument validation.

## Phase 2: Reliability

- [x] Stable UI selectors.
- [x] Retry and wait policies.
- [x] Better error recovery.
- [x] Task verification after actions.
- [x] Exportable debug traces.

## Phase 3: Skills

- [x] Add Markdown skill files.
- [x] Load skills into prompt context.
- [x] Add tool allowlists per skill.
- [x] Provide starter skills for browser, settings, and messages.

## Phase 4: MCP

- [x] Add MCP client support.
- [ ] Optionally expose Android tools as an MCP server.
- [x] Provide examples for desktop agents calling TouchPilot.

## Phase 5: Local Inference

- [x] Evaluate ExecuTorch, llama.cpp, and LiteRT.
- [x] Start with local routing for simple tool calls.
- [x] Keep cloud/provider fallback available for complex tasks.
- [ ] Integrate a real on-device model runtime.
