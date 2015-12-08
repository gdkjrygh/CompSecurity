.class public Lbolts/CancellationTokenSource;
.super Ljava/lang/Object;
.source "CancellationTokenSource.java"


# instance fields
.field private final token:Lbolts/CancellationToken;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lbolts/CancellationToken;

    invoke-direct {v0}, Lbolts/CancellationToken;-><init>()V

    iput-object v0, p0, Lbolts/CancellationTokenSource;->token:Lbolts/CancellationToken;

    .line 31
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lbolts/CancellationTokenSource;->token:Lbolts/CancellationToken;

    invoke-virtual {v0}, Lbolts/CancellationToken;->tryCancel()Z

    .line 52
    return-void
.end method

.method public getToken()Lbolts/CancellationToken;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lbolts/CancellationTokenSource;->token:Lbolts/CancellationToken;

    return-object v0
.end method

.method public isCancellationRequested()Z
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lbolts/CancellationTokenSource;->token:Lbolts/CancellationToken;

    invoke-virtual {v0}, Lbolts/CancellationToken;->isCancellationRequested()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 56
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s@%s[cancellationRequested=%s]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-virtual {p0}, Lbolts/CancellationTokenSource;->isCancellationRequested()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
