package Items.QuestItems;

import Items.Items;

public class QuestItems extends Items {

    public static int QuestItemsEq[] = new int[100];

    public  QuestItems(int dimension_x, int dimension_y, String name, int id){
        this.dimension_x = dimension_x;
        this.dimension_y = dimension_y;
        this.name = name;
        this.id = id;

    }
    public static void InitQuestItemsEq(){
        for(int x = 0;x<100;x++){
            QuestItemsEq[x] = -1;
        }
    }
    public static void addQuestItemToEq(int addId){
        for(int x = 0; x <100;x++){
            if(QuestItemsEq[x] == -1){
                QuestItemsEq[x] = QuestitemsList.QuestItemsArray[addId].id;
                break;
            }
        }
    }


}
