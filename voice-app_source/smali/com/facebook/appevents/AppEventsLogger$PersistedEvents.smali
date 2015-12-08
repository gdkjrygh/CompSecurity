.class Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/AppEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PersistedEvents"
.end annotation


# static fields
.field static final PERSISTED_EVENTS_FILENAME:Ljava/lang/String; = "AppEventsLogger.persistedevents"

.field private static staticLock:Ljava/lang/Object;


# instance fields
.field private context:Landroid/content/Context;

.field private persistedEvents:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1588
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->staticLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 1594
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1592
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    .line 1595
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->context:Landroid/content/Context;

    .line 1596
    return-void
.end method

.method public static persistEvents(Landroid/content/Context;Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "accessTokenAppId"    # Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;
    .param p2, "eventsToPersist"    # Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;

    .prologue
    .line 1610
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1611
    .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;>;"
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1612
    invoke-static {p0, v0}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistEvents(Landroid/content/Context;Ljava/util/Map;)V

    .line 1613
    return-void
.end method

.method public static persistEvents(Landroid/content/Context;Ljava/util/Map;)V
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;",
            "Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1619
    .local p1, "eventsToPersist":Ljava/util/Map;, "Ljava/util/Map<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;>;"
    sget-object v4, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->staticLock:Ljava/lang/Object;

    monitor-enter v4

    .line 1625
    :try_start_0
    invoke-static {p0}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->readAndClearStore(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;

    move-result-object v2

    .line 1628
    .local v2, "persistedEvents":Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 1627
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1637
    invoke-direct {v2}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->write()V

    .line 1619
    monitor-exit v4

    .line 1639
    return-void

    .line 1628
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1629
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;

    invoke-virtual {v3}, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->getEventsToPersist()Ljava/util/List;

    move-result-object v1

    .line 1630
    .local v1, "events":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_0

    .line 1634
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;

    invoke-virtual {v2, v3, v1}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->addEvents(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Ljava/util/List;)V

    goto :goto_0

    .line 1619
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;>;"
    .end local v1    # "events":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    .end local v2    # "persistedEvents":Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static readAndClearStore(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 1599
    sget-object v2, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->staticLock:Ljava/lang/Object;

    monitor-enter v2

    .line 1600
    :try_start_0
    new-instance v0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;

    invoke-direct {v0, p0}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;-><init>(Landroid/content/Context;)V

    .line 1602
    .local v0, "persistedEvents":Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
    invoke-direct {v0}, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->readAndClearStore()V

    .line 1604
    monitor-exit v2

    return-object v0

    .line 1599
    .end local v0    # "persistedEvents":Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private readAndClearStore()V
    .locals 7

    .prologue
    .line 1664
    const/4 v2, 0x0

    .line 1666
    .local v2, "ois":Ljava/io/ObjectInputStream;
    :try_start_0
    new-instance v3, Ljava/io/ObjectInputStream;

    .line 1667
    new-instance v4, Ljava/io/BufferedInputStream;

    iget-object v5, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->context:Landroid/content/Context;

    const-string v6, "AppEventsLogger.persistedevents"

    invoke-virtual {v5, v6}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 1666
    invoke-direct {v3, v4}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1671
    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .local v3, "ois":Ljava/io/ObjectInputStream;
    :try_start_1
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    .line 1675
    .local v1, "obj":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;>;"
    iget-object v4, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->context:Landroid/content/Context;

    const-string v5, "AppEventsLogger.persistedevents"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 1676
    iput-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1682
    invoke-static {v3}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    move-object v2, v3

    .line 1684
    .end local v1    # "obj":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;>;"
    .end local v3    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    :goto_0
    return-void

    .line 1677
    :catch_0
    move-exception v4

    .line 1682
    :goto_1
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1679
    :catch_1
    move-exception v0

    .line 1680
    .local v0, "e":Ljava/lang/Exception;
    :goto_2
    :try_start_2
    # getter for: Lcom/facebook/appevents/AppEventsLogger;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/appevents/AppEventsLogger;->access$1()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Got unexpected exception: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1682
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1681
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v4

    .line 1682
    :goto_3
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1683
    throw v4

    .line 1681
    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v3    # "ois":Ljava/io/ObjectInputStream;
    :catchall_1
    move-exception v4

    move-object v2, v3

    .end local v3    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_3

    .line 1679
    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v3    # "ois":Ljava/io/ObjectInputStream;
    :catch_2
    move-exception v0

    move-object v2, v3

    .end local v3    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_2

    .line 1677
    .end local v2    # "ois":Ljava/io/ObjectInputStream;
    .restart local v3    # "ois":Ljava/io/ObjectInputStream;
    :catch_3
    move-exception v4

    move-object v2, v3

    .end local v3    # "ois":Ljava/io/ObjectInputStream;
    .restart local v2    # "ois":Ljava/io/ObjectInputStream;
    goto :goto_1
.end method

.method private write()V
    .locals 7

    .prologue
    .line 1650
    const/4 v1, 0x0

    .line 1652
    .local v1, "oos":Ljava/io/ObjectOutputStream;
    :try_start_0
    new-instance v2, Ljava/io/ObjectOutputStream;

    .line 1653
    new-instance v3, Ljava/io/BufferedOutputStream;

    .line 1654
    iget-object v4, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->context:Landroid/content/Context;

    const-string v5, "AppEventsLogger.persistedevents"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v4

    .line 1653
    invoke-direct {v3, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1652
    invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1655
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .local v2, "oos":Ljava/io/ObjectOutputStream;
    :try_start_1
    iget-object v3, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1659
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    move-object v1, v2

    .line 1661
    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    :goto_0
    return-void

    .line 1656
    :catch_0
    move-exception v0

    .line 1657
    .local v0, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    # getter for: Lcom/facebook/appevents/AppEventsLogger;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/facebook/appevents/AppEventsLogger;->access$1()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Got unexpected exception: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1659
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 1658
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v3

    .line 1659
    :goto_2
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 1660
    throw v3

    .line 1658
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v2    # "oos":Ljava/io/ObjectOutputStream;
    :catchall_1
    move-exception v3

    move-object v1, v2

    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    goto :goto_2

    .line 1656
    .end local v1    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v2    # "oos":Ljava/io/ObjectOutputStream;
    :catch_1
    move-exception v0

    move-object v1, v2

    .end local v2    # "oos":Ljava/io/ObjectOutputStream;
    .restart local v1    # "oos":Ljava/io/ObjectOutputStream;
    goto :goto_1
.end method


# virtual methods
.method public addEvents(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;Ljava/util/List;)V
    .locals 2
    .param p1, "accessTokenAppId"    # Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1689
    .local p2, "eventsToPersist":Ljava/util/List;, "Ljava/util/List<Lcom/facebook/appevents/AppEventsLogger$AppEvent;>;"
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1690
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1692
    :cond_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1693
    return-void
.end method

.method public getEvents(Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;)Ljava/util/List;
    .locals 1
    .param p1, "accessTokenAppId"    # Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1646
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1642
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$PersistedEvents;->persistedEvents:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
