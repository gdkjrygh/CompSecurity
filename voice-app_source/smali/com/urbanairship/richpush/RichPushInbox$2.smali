.class Lcom/urbanairship/richpush/RichPushInbox$2;
.super Ljava/lang/Object;
.source "RichPushInbox.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/urbanairship/richpush/RichPushInbox;->markMessagesUnread(Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/urbanairship/richpush/RichPushInbox;

.field final synthetic val$messageIds:Ljava/util/Set;


# direct methods
.method constructor <init>(Lcom/urbanairship/richpush/RichPushInbox;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/urbanairship/richpush/RichPushInbox$2;->this$0:Lcom/urbanairship/richpush/RichPushInbox;

    iput-object p2, p0, Lcom/urbanairship/richpush/RichPushInbox$2;->val$messageIds:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 221
    sget-object v0, Lcom/urbanairship/richpush/RichPushManager;->resolver:Lcom/urbanairship/richpush/RichPushResolver;

    iget-object v1, p0, Lcom/urbanairship/richpush/RichPushInbox$2;->val$messageIds:Ljava/util/Set;

    invoke-virtual {v0, v1}, Lcom/urbanairship/richpush/RichPushResolver;->markMessagesUnread(Ljava/util/Set;)I

    .line 222
    return-void
.end method
