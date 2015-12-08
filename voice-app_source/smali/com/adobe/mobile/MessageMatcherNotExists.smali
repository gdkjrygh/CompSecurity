.class Lcom/adobe/mobile/MessageMatcherNotExists;
.super Lcom/adobe/mobile/MessageMatcherExists;
.source "MessageMatcherNotExists.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/adobe/mobile/MessageMatcherExists;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs matchesInMaps([Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 8
    .local p1, "maps":[Ljava/util/Map;, "[Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-super {p0, p1}, Lcom/adobe/mobile/MessageMatcherExists;->matchesInMaps([Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
