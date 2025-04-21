# Piston Sound Mod
In Minecraft 1.21 Minecraft Pistons can only be heard at a range of 8 blocks instead of the old 16 block range.
This mod reverts the distance back to 16 blocks.
The mod is client side only.

### How the mod works
The mod is made to work in environments where the server doesn't have this mod, which means the server will not send the sound packets itself to players further away than 8 blocks.
To fix that, the mod ignores all piston sound packets and uses the packets for rendering which are sent to players further away than 8 blocks.
As a result you won't hear it when the server plays the piston extend and retract sounds when they are not produced by a piston.
