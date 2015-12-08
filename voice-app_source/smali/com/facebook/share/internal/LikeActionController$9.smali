.class Lcom/facebook/share/internal/LikeActionController$9;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/share/internal/LikeActionController$RequestCompletionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/LikeActionController;->refreshStatusAsync()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType:[I


# instance fields
.field final synthetic this$0:Lcom/facebook/share/internal/LikeActionController;


# direct methods
.method static synthetic $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()[I
    .locals 3

    .prologue
    .line 1079
    sget-object v0, Lcom/facebook/share/internal/LikeActionController$9;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/facebook/share/widget/LikeView$ObjectType;->values()[Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/facebook/share/widget/LikeView$ObjectType;->OPEN_GRAPH:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$ObjectType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_1
    :try_start_1
    sget-object v1, Lcom/facebook/share/widget/LikeView$ObjectType;->PAGE:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$ObjectType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    :try_start_2
    sget-object v1, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$ObjectType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sput-object v0, Lcom/facebook/share/internal/LikeActionController$9;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method constructor <init>(Lcom/facebook/share/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    .line 1079
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$1(Lcom/facebook/share/internal/LikeActionController$9;)Lcom/facebook/share/internal/LikeActionController;
    .locals 1

    .prologue
    .line 1079
    iget-object v0, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    return-object v0
.end method


# virtual methods
.method public onComplete()V
    .locals 6

    .prologue
    .line 1083
    invoke-static {}, Lcom/facebook/share/internal/LikeActionController$9;->$SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()[I

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;
    invoke-static {v4}, Lcom/facebook/share/internal/LikeActionController;->access$22(Lcom/facebook/share/internal/LikeActionController;)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/share/widget/LikeView$ObjectType;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 1089
    new-instance v1, Lcom/facebook/share/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-object v3, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    iget-object v4, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/share/internal/LikeActionController;->access$21(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;
    invoke-static {v5}, Lcom/facebook/share/internal/LikeActionController;->access$22(Lcom/facebook/share/internal/LikeActionController;)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v5

    invoke-direct {v1, v3, v4, v5}, Lcom/facebook/share/internal/LikeActionController$GetOGObjectLikesRequestWrapper;-><init>(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 1093
    .local v1, "likeRequestWrapper":Lcom/facebook/share/internal/LikeActionController$LikeRequestWrapper;
    :goto_0
    new-instance v0, Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v3, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    iget-object v4, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/share/internal/LikeActionController;->access$21(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;
    invoke-static {v5}, Lcom/facebook/share/internal/LikeActionController;->access$22(Lcom/facebook/share/internal/LikeActionController;)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v5

    invoke-direct {v0, v3, v4, v5}, Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;-><init>(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$ObjectType;)V

    .line 1095
    .local v0, "engagementRequest":Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;
    new-instance v2, Lcom/facebook/GraphRequestBatch;

    invoke-direct {v2}, Lcom/facebook/GraphRequestBatch;-><init>()V

    .line 1096
    .local v2, "requestBatch":Lcom/facebook/GraphRequestBatch;
    invoke-interface {v1, v2}, Lcom/facebook/share/internal/LikeActionController$LikeRequestWrapper;->addToBatch(Lcom/facebook/GraphRequestBatch;)V

    .line 1097
    invoke-virtual {v0, v2}, Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;->addToBatch(Lcom/facebook/GraphRequestBatch;)V

    .line 1099
    new-instance v3, Lcom/facebook/share/internal/LikeActionController$9$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/facebook/share/internal/LikeActionController$9$1;-><init>(Lcom/facebook/share/internal/LikeActionController$9;Lcom/facebook/share/internal/LikeActionController$LikeRequestWrapper;Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;)V

    invoke-virtual {v2, v3}, Lcom/facebook/GraphRequestBatch;->addCallback(Lcom/facebook/GraphRequestBatch$Callback;)V

    .line 1123
    invoke-virtual {v2}, Lcom/facebook/GraphRequestBatch;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    .line 1124
    return-void

    .line 1085
    .end local v0    # "engagementRequest":Lcom/facebook/share/internal/LikeActionController$GetEngagementRequestWrapper;
    .end local v1    # "likeRequestWrapper":Lcom/facebook/share/internal/LikeActionController$LikeRequestWrapper;
    .end local v2    # "requestBatch":Lcom/facebook/GraphRequestBatch;
    :pswitch_0
    new-instance v1, Lcom/facebook/share/internal/LikeActionController$GetPageLikesRequestWrapper;

    iget-object v3, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    iget-object v4, p0, Lcom/facebook/share/internal/LikeActionController$9;->this$0:Lcom/facebook/share/internal/LikeActionController;

    # getter for: Lcom/facebook/share/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/share/internal/LikeActionController;->access$21(Lcom/facebook/share/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/facebook/share/internal/LikeActionController$GetPageLikesRequestWrapper;-><init>(Lcom/facebook/share/internal/LikeActionController;Ljava/lang/String;)V

    .line 1086
    .restart local v1    # "likeRequestWrapper":Lcom/facebook/share/internal/LikeActionController$LikeRequestWrapper;
    goto :goto_0

    .line 1083
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
