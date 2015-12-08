.class public Lcom/urbanairship/push/embedded/BoxOfficeClient$FatalBoxOfficeException;
.super Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;
.source "BoxOfficeClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/push/embedded/BoxOfficeClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FatalBoxOfficeException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/urbanairship/push/embedded/BoxOfficeClient$BoxOfficeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
