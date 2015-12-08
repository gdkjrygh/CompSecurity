.class public Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;
.super Ljava/lang/Object;
.source "FramedataImpl1.java"

# interfaces
.implements Lcom/mixpanel/android/java_websocket/framing/FrameBuilder;


# static fields
.field protected static emptyarray:[B


# instance fields
.field protected fin:Z

.field protected optcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

.field protected transferemasked:Z

.field private unmaskedpayload:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->emptyarray:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V
    .locals 1
    .param p1, "op"    # Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->optcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 22
    sget-object v0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->emptyarray:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    .line 23
    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 1
    .param p1, "f"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->isFin()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->fin:Z

    .line 31
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->optcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 32
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    .line 33
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getTransfereMasked()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->transferemasked:Z

    .line 34
    return-void
.end method


# virtual methods
.method public append(Lcom/mixpanel/android/java_websocket/framing/Framedata;)V
    .locals 4
    .param p1, "nextframe"    # Lcom/mixpanel/android/java_websocket/framing/Framedata;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidFrameException;
        }
    .end annotation

    .prologue
    .line 78
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->getPayloadData()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 79
    .local v0, "b":Ljava/nio/ByteBuffer;
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    if-nez v2, :cond_0

    .line 80
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    .line 81
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 82
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 83
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    .line 102
    :goto_0
    invoke-interface {p1}, Lcom/mixpanel/android/java_websocket/framing/Framedata;->isFin()Z

    move-result v2

    iput-boolean v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->fin:Z

    .line 103
    return-void

    .line 85
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    .line 86
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->limit()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 87
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 89
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    iget-object v3, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 91
    .local v1, "tmp":Ljava/nio/ByteBuffer;
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 92
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 93
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 94
    iput-object v1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    .line 99
    .end local v1    # "tmp":Ljava/nio/ByteBuffer;
    :goto_1
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 100
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    goto :goto_0

    .line 97
    :cond_1
    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_1
.end method

.method public getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->optcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    return-object v0
.end method

.method public getPayloadData()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getTransfereMasked()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->transferemasked:Z

    return v0
.end method

.method public isFin()Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->fin:Z

    return v0
.end method

.method public setFin(Z)V
    .locals 0
    .param p1, "fin"    # Z

    .prologue
    .line 58
    iput-boolean p1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->fin:Z

    .line 59
    return-void
.end method

.method public setOptcode(Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;)V
    .locals 0
    .param p1, "optcode"    # Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .prologue
    .line 63
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->optcode:Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    .line 64
    return-void
.end method

.method public setPayload(Ljava/nio/ByteBuffer;)V
    .locals 0
    .param p1, "payload"    # Ljava/nio/ByteBuffer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/java_websocket/exceptions/InvalidDataException;
        }
    .end annotation

    .prologue
    .line 68
    iput-object p1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    .line 69
    return-void
.end method

.method public setTransferemasked(Z)V
    .locals 0
    .param p1, "transferemasked"    # Z

    .prologue
    .line 73
    iput-boolean p1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->transferemasked:Z

    .line 74
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Framedata{ optcode:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->getOpcode()Lcom/mixpanel/android/java_websocket/framing/Framedata$Opcode;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fin:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->isFin()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", payloadlength:[pos:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", len:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "], payload:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/java_websocket/framing/FramedataImpl1;->unmaskedpayload:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-static {v1}, Lcom/mixpanel/android/java_websocket/util/Charsetfunctions;->utf8Bytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
