.class public Lcom/urbanairship/util/NotificationIDGenerator;
.super Ljava/lang/Object;
.source "NotificationIDGenerator.java"


# static fields
.field private static final MAX_RANGE:I = 0x32

.field private static final NEXT_ID_KEY:Ljava/lang/String; = "count"

.field private static final SHARED_PREFERENCES_FILE:Ljava/lang/String; = "com.urbanairship.notificationidgenerator"

.field private static range:I

.field private static start:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const/16 v0, 0x3e8

    sput v0, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    .line 45
    const/16 v0, 0x28

    sput v0, Lcom/urbanairship/util/NotificationIDGenerator;->range:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getInt(Ljava/lang/String;I)I
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "defvalue"    # I

    .prologue
    .line 60
    invoke-static {}, Lcom/urbanairship/util/NotificationIDGenerator;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private static getPreferences()Landroid/content/SharedPreferences;
    .locals 3

    .prologue
    .line 48
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 49
    .local v0, "appContext":Landroid/content/Context;
    const-string v1, "com.urbanairship.notificationidgenerator"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    return-object v1
.end method

.method public static getRange()I
    .locals 1

    .prologue
    .line 103
    sget v0, Lcom/urbanairship/util/NotificationIDGenerator;->range:I

    return v0
.end method

.method public static getStart()I
    .locals 1

    .prologue
    .line 95
    sget v0, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    return v0
.end method

.method public static nextID()I
    .locals 4

    .prologue
    .line 113
    const-string v2, "count"

    sget v3, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    invoke-static {v2, v3}, Lcom/urbanairship/util/NotificationIDGenerator;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 118
    .local v0, "id":I
    add-int/lit8 v0, v0, 0x1

    move v1, v0

    .line 119
    .local v1, "nextId":I
    sget v2, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    sget v3, Lcom/urbanairship/util/NotificationIDGenerator;->range:I

    add-int/2addr v2, v3

    if-ge v1, v2, :cond_0

    .line 120
    const-string v2, "Incrementing notification id count"

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 121
    const-string v2, "count"

    invoke-static {v2, v1}, Lcom/urbanairship/util/NotificationIDGenerator;->putInt(Ljava/lang/String;I)V

    .line 130
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Notification id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 132
    return v0

    .line 126
    :cond_0
    const-string v2, "Resetting notification id count"

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 127
    const-string v2, "count"

    sget v3, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    invoke-static {v2, v3}, Lcom/urbanairship/util/NotificationIDGenerator;->putInt(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private static putInt(Ljava/lang/String;I)V
    .locals 2
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "value"    # I

    .prologue
    .line 53
    invoke-static {}, Lcom/urbanairship/util/NotificationIDGenerator;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 54
    .local v1, "prefs":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 55
    .local v0, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 56
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 57
    return-void
.end method

.method public static setRange(I)V
    .locals 2
    .param p0, "newRange"    # I

    .prologue
    .line 81
    const/16 v0, 0x32

    if-le p0, v0, :cond_0

    .line 82
    const-string v0, "The maximum numer of notifications allowed is 50. Limiting alert id range to conform."

    invoke-static {v0}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 83
    const/16 p0, 0x32

    .line 86
    :cond_0
    const-string v0, "count"

    sget v1, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    invoke-static {v0, v1}, Lcom/urbanairship/util/NotificationIDGenerator;->putInt(Ljava/lang/String;I)V

    .line 87
    sput p0, Lcom/urbanairship/util/NotificationIDGenerator;->range:I

    .line 88
    return-void
.end method

.method public static setStart(I)V
    .locals 1
    .param p0, "value"    # I

    .prologue
    .line 69
    const-string v0, "count"

    invoke-static {v0, p0}, Lcom/urbanairship/util/NotificationIDGenerator;->putInt(Ljava/lang/String;I)V

    .line 70
    sput p0, Lcom/urbanairship/util/NotificationIDGenerator;->start:I

    .line 71
    return-void
.end method
