.class Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;
.super Ljava/lang/Object;
.source "DynamicEventTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnsentEvent"
.end annotation


# instance fields
.field public final eventName:Ljava/lang/String;

.field public final properties:Lorg/json/JSONObject;

.field public final timeSentMillis:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;J)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "props"    # Lorg/json/JSONObject;
    .param p3, "timeSent"    # J

    .prologue
    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->eventName:Ljava/lang/String;

    .line 165
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->properties:Lorg/json/JSONObject;

    .line 166
    iput-wide p3, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$UnsentEvent;->timeSentMillis:J

    .line 167
    return-void
.end method
