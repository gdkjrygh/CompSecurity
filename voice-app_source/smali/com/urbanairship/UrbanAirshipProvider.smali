.class public Lcom/urbanairship/UrbanAirshipProvider;
.super Landroid/content/ContentProvider;
.source "UrbanAirshipProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    }
.end annotation


# static fields
.field public static final DB_CHANGE_ACTION_KEY:Ljava/lang/String; = "com.urbanairship.DB_CHANGE_ACTION"

.field public static final DB_CHANGE_KEYS_KEY:Ljava/lang/String; = "com.urbanairship.DB_CHANGE_KEYS"

.field public static final DELETE_ACTION:Ljava/lang/String; = "delete"

.field public static final INSERT_ACTION:Ljava/lang/String; = "insert"

.field public static final KEYS_DELIMITER:Ljava/lang/String; = "|"

.field private static final KEYS_LOCATION:I = 0x1

.field private static final MATCHER:Landroid/content/UriMatcher;

.field static final MULTIPLE_SUFFIX:Ljava/lang/String; = "vnd.urbanairship.cursor.dir/"

.field static final PREFERENCES_CONTENT_ITEM_TYPE:Ljava/lang/String; = "vnd.urbanairship.cursor.item/preference"

.field static final PREFERENCES_CONTENT_TYPE:Ljava/lang/String; = "vnd.urbanairship.cursor.dir/preference"

.field private static final PREFERENCES_URI_TYPE:I = 0x2

.field private static final PREFERENCE_URI_TYPE:I = 0x3

.field public static final REPLACE_ACTION:Ljava/lang/String; = "replace"

.field private static final RICHPUSH_MESSAGES_URI_TYPE:I = 0x0

.field private static final RICHPUSH_MESSAGE_URI_TYPE:I = 0x1

.field static final RICH_PUSH_CONTENT_ITEM_TYPE:Ljava/lang/String; = "vnd.urbanairship.cursor.item/richpush"

.field static final RICH_PUSH_CONTENT_TYPE:Ljava/lang/String; = "vnd.urbanairship.cursor.dir/richpush"

.field static final SINGLE_SUFFIX:Ljava/lang/String; = "vnd.urbanairship.cursor.item/"

.field public static final UPDATE_ACTION:Ljava/lang/String; = "update"

.field private static authorityString:Ljava/lang/String;


# instance fields
.field private preferencesModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

.field private richPushModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 101
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 343
    return-void
.end method

.method public static getAuthorityString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 180
    sget-object v1, Lcom/urbanairship/UrbanAirshipProvider;->authorityString:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 181
    invoke-static {}, Lcom/urbanairship/UAirship;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 182
    .local v0, "packageName":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".urbanairship.provider"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/urbanairship/UrbanAirshipProvider;->authorityString:Ljava/lang/String;

    .line 185
    :cond_0
    sget-object v1, Lcom/urbanairship/UrbanAirshipProvider;->authorityString:Ljava/lang/String;

    return-object v1
.end method

.method private getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    .locals 4
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 326
    sget-object v1, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 327
    .local v0, "type":I
    packed-switch v0, :pswitch_data_0

    .line 336
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid URI: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 330
    :pswitch_0
    invoke-direct {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v1

    .line 334
    :goto_0
    return-object v1

    :pswitch_1
    invoke-direct {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v1

    goto :goto_0

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private getKeys(Landroid/net/Uri;)[Ljava/lang/String;
    .locals 3
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 314
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "\\|"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 316
    :goto_0
    return-object v1

    .line 315
    :catch_0
    move-exception v0

    .line 316
    .local v0, "e":Ljava/lang/IndexOutOfBoundsException;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    goto :goto_0
.end method

.method public static getPreferencesContentUri()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/preferences"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private getPreferencesModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->preferencesModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    if-nez v0, :cond_0

    .line 292
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->createPreferencesModel(Landroid/content/Context;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->preferencesModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->preferencesModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    return-object v0
.end method

.method public static getRichPushContentUri()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/richpush"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private getRichPushModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->richPushModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    if-nez v0, :cond_0

    .line 302
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->createRichPushModel(Landroid/content/Context;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v0

    iput-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->richPushModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/urbanairship/UrbanAirshipProvider;->richPushModel:Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    return-object v0
.end method

.method public static init()V
    .locals 4

    .prologue
    .line 153
    sget-object v0, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "richpush"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 154
    sget-object v0, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "richpush/*"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 155
    sget-object v0, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "preferences"

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 156
    sget-object v0, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getAuthorityString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "preferences/*"

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 157
    return-void
.end method


# virtual methods
.method public bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 7
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # [Landroid/content/ContentValues;

    .prologue
    .line 222
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v4

    .line 223
    .local v4, "model":Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    iget-object v3, v4, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 225
    .local v3, "manager":Lcom/urbanairship/util/DataManager;
    iget-object v5, v4, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    invoke-virtual {v3, v5, p2}, Lcom/urbanairship/util/DataManager;->bulkInsert(Ljava/lang/String;[Landroid/content/ContentValues;)Ljava/util/List;

    move-result-object v2

    .line 227
    .local v2, "insertedValues":Ljava/util/List;, "Ljava/util/List<Landroid/content/ContentValues;>;"
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    new-array v1, v5, [Ljava/lang/String;

    .line 228
    .local v1, "ids":[Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v5, v1

    if-ge v0, v5, :cond_0

    .line 229
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/ContentValues;

    iget-object v6, v4, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notificationColumnId:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v0

    .line 228
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "insert"

    invoke-virtual {v4, v5, v1, v6}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notifyDatabaseChange(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    return v5
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "selection"    # Ljava/lang/String;
    .param p3, "selectionArgs"    # [Ljava/lang/String;

    .prologue
    .line 195
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v1

    .line 196
    .local v1, "model":Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    iget-object v0, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 198
    .local v0, "manager":Lcom/urbanairship/util/DataManager;
    iget-object v3, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    invoke-virtual {v0, v3, p2, p3}, Lcom/urbanairship/util/DataManager;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    .line 200
    .local v2, "numberDeleted":I
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getKeys(Landroid/net/Uri;)[Ljava/lang/String;

    move-result-object v4

    const-string v5, "delete"

    invoke-virtual {v1, v3, v4, v5}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notifyDatabaseChange(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return v2
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 4
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    .line 206
    sget-object v1, Lcom/urbanairship/UrbanAirshipProvider;->MATCHER:Landroid/content/UriMatcher;

    invoke-virtual {v1, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 207
    .local v0, "type":I
    packed-switch v0, :pswitch_data_0

    .line 217
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid Uri: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 209
    :pswitch_0
    const-string v1, "vnd.urbanairship.cursor.dir/richpush"

    .line 215
    :goto_0
    return-object v1

    .line 211
    :pswitch_1
    const-string v1, "vnd.urbanairship.cursor.item/richpush"

    goto :goto_0

    .line 213
    :pswitch_2
    const-string v1, "vnd.urbanairship.cursor.dir/preference"

    goto :goto_0

    .line 215
    :pswitch_3
    const-string v1, "vnd.urbanairship.cursor.item/preference"

    goto :goto_0

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 8
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 238
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v1

    .line 239
    .local v1, "model":Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    iget-object v0, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 241
    .local v0, "manager":Lcom/urbanairship/util/DataManager;
    iget-object v3, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    invoke-virtual {v0, v3, p2}, Lcom/urbanairship/util/DataManager;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-eqz v3, :cond_0

    .line 242
    iget-object v3, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notificationColumnId:Ljava/lang/String;

    invoke-virtual {p2, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 243
    .local v2, "uriKey":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v5, "insert"

    invoke-virtual {v1, v3, v4, v5}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notifyDatabaseChange(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    invoke-static {p1, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 247
    .end local v2    # "uriKey":Ljava/lang/String;
    :goto_0
    return-object v3

    :cond_0
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public onCreate()Z
    .locals 1

    .prologue
    .line 190
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "projection"    # [Ljava/lang/String;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;
    .param p5, "sortOrder"    # Ljava/lang/String;

    .prologue
    .line 252
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v7

    .line 253
    .local v7, "model":Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    iget-object v0, v7, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 255
    .local v0, "manager":Lcom/urbanairship/util/DataManager;
    iget-object v1, v7, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/util/DataManager;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 257
    .local v6, "cursor":Landroid/database/Cursor;
    if-eqz v6, :cond_0

    .line 258
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-interface {v6, v1, p1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 261
    :cond_0
    return-object v6
.end method

.method public shutdown()V
    .locals 1

    .prologue
    .line 279
    invoke-direct {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getRichPushModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v0

    iget-object v0, v0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    invoke-virtual {v0}, Lcom/urbanairship/util/DataManager;->close()V

    .line 280
    invoke-direct {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesModel()Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v0

    iget-object v0, v0, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    invoke-virtual {v0}, Lcom/urbanairship/util/DataManager;->close()V

    .line 281
    return-void
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;

    .prologue
    .line 266
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getDatabaseModel(Landroid/net/Uri;)Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;

    move-result-object v1

    .line 267
    .local v1, "model":Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;
    iget-object v0, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->dataManager:Lcom/urbanairship/util/DataManager;

    .line 269
    .local v0, "manager":Lcom/urbanairship/util/DataManager;
    iget-object v3, v1, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->table:Ljava/lang/String;

    invoke-virtual {v0, v3, p2, p3, p4}, Lcom/urbanairship/util/DataManager;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    .line 270
    .local v2, "updated":I
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 271
    invoke-virtual {p0}, Lcom/urbanairship/UrbanAirshipProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipProvider;->getKeys(Landroid/net/Uri;)[Ljava/lang/String;

    move-result-object v4

    const-string v5, "update"

    invoke-virtual {v1, v3, v4, v5}, Lcom/urbanairship/UrbanAirshipProvider$DatabaseModel;->notifyDatabaseChange(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :cond_0
    return v2
.end method
