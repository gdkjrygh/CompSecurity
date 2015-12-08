.class Lio/fabric/sdk/android/services/events/EventsFilesManager$1;
.super Ljava/lang/Object;
.source "EventsFilesManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/events/EventsFilesManager;->deleteOldestInRollOverIfOverMax()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/events/EventsFilesManager;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/events/EventsFilesManager;)V
    .locals 0

    .prologue
    .line 204
    .local p0, "this":Lio/fabric/sdk/android/services/events/EventsFilesManager$1;, "Lio/fabric/sdk/android/services/events/EventsFilesManager.1;"
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EventsFilesManager$1;->this$0:Lio/fabric/sdk/android/services/events/EventsFilesManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;)I
    .locals 4
    .param p1, "arg0"    # Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;
    .param p2, "arg1"    # Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;

    .prologue
    .line 207
    .local p0, "this":Lio/fabric/sdk/android/services/events/EventsFilesManager$1;, "Lio/fabric/sdk/android/services/events/EventsFilesManager.1;"
    iget-wide v0, p1, Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;->timestamp:J

    iget-wide v2, p2, Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;->timestamp:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 204
    .local p0, "this":Lio/fabric/sdk/android/services/events/EventsFilesManager$1;, "Lio/fabric/sdk/android/services/events/EventsFilesManager.1;"
    check-cast p1, Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;

    .end local p1    # "x0":Ljava/lang/Object;
    check-cast p2, Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;

    .end local p2    # "x1":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lio/fabric/sdk/android/services/events/EventsFilesManager$1;->compare(Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;Lio/fabric/sdk/android/services/events/EventsFilesManager$FileWithTimestamp;)I

    move-result v0

    return v0
.end method
