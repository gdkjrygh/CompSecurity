.class public final enum Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
.super Ljava/lang/Enum;
.source "Draft.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/java_websocket/drafts/Draft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HandshakeState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

.field public static final enum MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

.field public static final enum NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    const-string v1, "MATCHED"

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;-><init>(Ljava/lang/String;I)V

    .line 36
    sput-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 37
    new-instance v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    const-string v1, "NOT_MATCHED"

    invoke-direct {v0, v1, v3}, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;-><init>(Ljava/lang/String;I)V

    .line 38
    sput-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    .line 34
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->NOT_MATCHED:Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->ENUM$VALUES:[Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;->ENUM$VALUES:[Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    array-length v1, v0

    new-array v2, v1, [Lcom/mixpanel/android/java_websocket/drafts/Draft$HandshakeState;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
