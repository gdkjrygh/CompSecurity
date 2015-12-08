.class public Lcom/mixpanel/android/mpmetrics/Tweaks;
.super Ljava/lang/Object;
.source "Tweaks.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;,
        Lcom/mixpanel/android/mpmetrics/Tweaks$TweakType;,
        Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    }
.end annotation


# static fields
.field public static final BOOLEAN_TYPE:I = 0x1

.field public static final DOUBLE_TYPE:I = 0x2

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.Tweaks"

.field public static final LONG_TYPE:I = 0x3

.field public static final STRING_TYPE:I = 0x4


# instance fields
.field private final mTweakDeclaredListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;",
            ">;"
        }
    .end annotation
.end field

.field private final mTweakValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakDeclaredListeners:Ljava/util/List;

    .line 201
    return-void
.end method

.method static synthetic access$0(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .locals 1

    .prologue
    .line 298
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->getValue(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    move-result-object v0

    return-object v0
.end method

.method private declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 9
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/Object;
    .param p3, "tweakType"    # I

    .prologue
    const/4 v3, 0x0

    .line 303
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 304
    const-string v1, "MixpanelAPI.Tweaks"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attempt to define a tweak \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" twice with the same name"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    :cond_0
    return-void

    .line 308
    :cond_1
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    move v1, p3

    move-object v2, p2

    move-object v4, v3

    move-object v5, p2

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;-><init>(ILjava/lang/Object;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Object;Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;)V

    .line 309
    .local v0, "value":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakDeclaredListeners:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    .line 311
    .local v8, "listenerSize":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_0
    if-ge v7, v8, :cond_0

    .line 312
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakDeclaredListeners:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;

    invoke-interface {v1}, Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;->onTweakDeclared()V

    .line 311
    add-int/lit8 v7, v7, 0x1

    goto :goto_0
.end method

.method private declared-synchronized getValue(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .locals 1
    .param p1, "tweakName"    # Ljava/lang/String;

    .prologue
    .line 299
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized addOnTweakDeclaredListener(Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;)V
    .locals 2
    .param p1, "listener"    # Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;

    .prologue
    .line 29
    monitor-enter p0

    if-nez p1, :cond_0

    .line 30
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "listener cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 32
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakDeclaredListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    monitor-exit p0

    return-void
.end method

.method booleanTweak(Ljava/lang/String;Z)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 288
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 289
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$8;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$8;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method byteTweak(Ljava/lang/String;B)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "B)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    .prologue
    .line 264
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 265
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$6;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$6;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method doubleTweak(Ljava/lang/String;D)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # D
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .prologue
    .line 216
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 217
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$2;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$2;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method floatTweak(Ljava/lang/String;F)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .prologue
    .line 228
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 229
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$3;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$3;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method public declared-synchronized getAllValues()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;",
            ">;"
        }
    .end annotation

    .prologue
    .line 57
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method intTweak(Ljava/lang/String;I)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 252
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 253
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$5;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$5;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method longTweak(Ljava/lang/String;J)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 240
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 241
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$4;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$4;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method public declared-synchronized set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 40
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 41
    const-string v2, "MixpanelAPI.Tweaks"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Attempt to set a tweak \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\" which has never been defined."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    :goto_0
    monitor-exit p0

    return-void

    .line 45
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    .line 46
    .local v0, "container":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    invoke-virtual {v0, p2}, Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;->updateValue(Ljava/lang/Object;)Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;

    move-result-object v1

    .line 47
    .local v1, "updated":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/Tweaks;->mTweakValues:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 40
    .end local v0    # "container":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    .end local v1    # "updated":Lcom/mixpanel/android/mpmetrics/Tweaks$TweakValue;
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method shortTweak(Ljava/lang/String;S)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 2
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # S
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "S)",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .prologue
    .line 276
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 277
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$7;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$7;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method

.method stringTweak(Ljava/lang/String;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/Tweak;
    .locals 1
    .param p1, "tweakName"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/mixpanel/android/mpmetrics/Tweak",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 205
    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lcom/mixpanel/android/mpmetrics/Tweaks;->declareTweak(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 206
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Tweaks$1;

    invoke-direct {v0, p0, p1}, Lcom/mixpanel/android/mpmetrics/Tweaks$1;-><init>(Lcom/mixpanel/android/mpmetrics/Tweaks;Ljava/lang/String;)V

    return-object v0
.end method
