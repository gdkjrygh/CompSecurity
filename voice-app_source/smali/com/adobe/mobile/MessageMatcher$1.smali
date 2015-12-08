.class final Lcom/adobe/mobile/MessageMatcher$1;
.super Ljava/util/HashMap;
.source "MessageMatcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/MessageMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Class;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 61
    const-string v0, "eq"

    const-class v1, Lcom/adobe/mobile/MessageMatcherEquals;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-string v0, "ne"

    const-class v1, Lcom/adobe/mobile/MessageMatcherNotEquals;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    const-string v0, "gt"

    const-class v1, Lcom/adobe/mobile/MessageMatcherGreaterThan;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "ge"

    const-class v1, Lcom/adobe/mobile/MessageMatcherGreaterThanOrEqual;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    const-string v0, "lt"

    const-class v1, Lcom/adobe/mobile/MessageMatcherLessThan;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "le"

    const-class v1, Lcom/adobe/mobile/MessageMatcherLessThanOrEqual;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    const-string v0, "co"

    const-class v1, Lcom/adobe/mobile/MessageMatcherContains;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v0, "nc"

    const-class v1, Lcom/adobe/mobile/MessageMatcherNotContains;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    const-string v0, "sw"

    const-class v1, Lcom/adobe/mobile/MessageMatcherStartsWith;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    const-string v0, "ew"

    const-class v1, Lcom/adobe/mobile/MessageMatcherEndsWith;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const-string v0, "ex"

    const-class v1, Lcom/adobe/mobile/MessageMatcherExists;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    const-string v0, "nx"

    const-class v1, Lcom/adobe/mobile/MessageMatcherNotExists;

    invoke-virtual {p0, v0, v1}, Lcom/adobe/mobile/MessageMatcher$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    return-void
.end method
