.class public interface abstract Lcom/mixpanel/android/java_websocket/framing/CloseFrame;
.super Ljava/lang/Object;
.source "CloseFrame.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/framing/Framedata;


# static fields
.field public static final ABNORMAL_CLOSE:I = 0x3ee

.field public static final BUGGYCLOSE:I = -0x2

.field public static final EXTENSION:I = 0x3f2

.field public static final FLASHPOLICY:I = -0x3

.field public static final GOING_AWAY:I = 0x3e9

.field public static final NEVER_CONNECTED:I = -0x1

.field public static final NOCODE:I = 0x3ed

.field public static final NORMAL:I = 0x3e8

.field public static final NO_UTF8:I = 0x3ef

.field public static final POLICY_VALIDATION:I = 0x3f0

.field public static final PROTOCOL_ERROR:I = 0x3ea

.field public static final REFUSE:I = 0x3eb

.field public static final TLS_ERROR:I = 0x3f7

.field public static final TOOBIG:I = 0x3f1

.field public static final UNEXPECTED_CONDITION:I = 0x3f3


# virtual methods
.method public abstract getCloseCode()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;
        }
    .end annotation
.end method

.method public abstract getMessage()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation
.end method
