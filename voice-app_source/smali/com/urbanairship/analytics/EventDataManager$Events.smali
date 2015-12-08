.class public final Lcom/urbanairship/analytics/EventDataManager$Events;
.super Ljava/lang/Object;
.source "EventDataManager.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/analytics/EventDataManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Events"
.end annotation


# static fields
.field public static final ASCENDING_SORT_ORDER:Ljava/lang/String; = "_id ASC"

.field public static final COLUMN_NAME_DATA:Ljava/lang/String; = "data"

.field public static final COLUMN_NAME_EVENT_ID:Ljava/lang/String; = "event_id"

.field public static final COLUMN_NAME_EVENT_SIZE:Ljava/lang/String; = "event_size"

.field public static final COLUMN_NAME_SESSION_ID:Ljava/lang/String; = "session_id"

.field public static final COLUMN_NAME_TIME:Ljava/lang/String; = "time"

.field public static final COLUMN_NAME_TYPE:Ljava/lang/String; = "type"

.field public static final TABLE_NAME:Ljava/lang/String; = "events"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
