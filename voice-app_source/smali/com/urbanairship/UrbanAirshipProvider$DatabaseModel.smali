.class Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
.super Ljava/lang/Object;
.source "UrbanAirshipProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/UrbanAirshipProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DatabaseModel"
.end annotation


# instance fields
.field contentUri:Landroid/net/Uri;

.field dataManager:Lcom/urbanairship/util/DataManager;

.field notificationColumnId:Ljava/lang/String;

.field table:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/urbanairship/util/DataManager;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 0
    .param p1, "dataManager"    # Lcom/urbanairship/util/DataManager;
    .param p2, "table"    # Ljava/lang/String;
    .param p3, "contentUri"    # Landroid/net/Uri;
    .param p4, "notificationColumnId"    # Ljava/lang/String;

    .prologue
    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    iput-object p1, p0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 360
    iput-object p2, p0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    .line 361
    iput-object p3, p0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->contentUri:Landroid/net/Uri;

    .line 362
    iput-object p4, p0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notificationColumnId:Ljava/lang/String;

    .line 363
    return-void
.end method

.method static createPreferencesModel(Landroid/content/Context;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 382
    new-instance v0, Lcom/urbanairship/PreferencesDataManager;

    invoke-direct {v0, p0}, Lcom/urbanairship/PreferencesDataManager;-><init>(Landroid/content/Context;)V

    .line 383
    .local v0, "model":Lcom/urbanairship/util/DataManager;
    new-instance v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    const-string v2, "preferences"

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v3

    const-string v4, "_id"

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;-><init>(Lcom/urbanairship/util/DataManager;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-object v1
.end method

.method static createRichPushModel(Landroid/content/Context;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 371
    new-instance v0, Lcom/urbanairship/RichPushDataManager;

    invoke-direct {v0, p0}, Lcom/urbanairship/RichPushDataManager;-><init>(Landroid/content/Context;)V

    .line 372
    .local v0, "model":Lcom/urbanairship/util/DataManager;
    new-instance v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    const-string v2, "richpush"

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushContentUri()Landroid/net/Uri;

    move-result-object v3

    const-string v4, "message_id"

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;-><init>(Lcom/urbanairship/util/DataManager;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method notifyDatabaseChange(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "ids"    # [Ljava/lang/String;
    .param p3, "action"    # Ljava/lang/String;

    .prologue
    .line 394
    iget-object v1, p0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->contentUri:Landroid/net/Uri;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "|"

    invoke-static {v3, v4}, Lcom/urbanairship/util/UAStringUtil;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 395
    .local v0, "newUri":Landroid/net/Uri;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notifying of change to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 396
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 397
    return-void
.end method
