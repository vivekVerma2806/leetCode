class LFUCache {
public:

   int cap;
   int size;
   unordered_map<int,list<vector<int>> ::iterator>mp;   //--->{key ,aur esh ka Adress}

    map<int,list<vector<int>>>freq;  //-->key -->{key , value ,counter}

    LFUCache(int capacity) {
        cap=capacity;
        size=0;
    }
   void updatefeq(int key) {

    auto it = mp[key];

    int val = (*it)[1];
    int counter = (*it)[2];

    // old frequency list se remove
    freq[counter].erase(it);

    if (freq[counter].empty())
        freq.erase(counter);

    counter++;

    freq[counter].push_front({key, val, counter});

    mp[key] = freq[counter].begin();
}
    
    int get(int key) {
        if(mp.find(key)==mp.end()){return -1;}

        auto &vec=*(mp[key]);  // key value conter 

        int val=vec[1];
        
        updatefeq(key);


        return val;
    }
    
    void put(int key, int value) {
        if(cap==0) return;

        if(mp.find(key)!=mp.end()){
            auto &vec =(*(mp[key]));
            vec[1]=value;
            updatefeq(key);
        }else if(size<cap){
           size++;
           // yaha key aur value aya hain 
           freq[1].push_front({key,value,1});
           mp[key]=freq[1].begin();

        }else{
            //jab space full ho jaiye 

            auto &koun_sa_list = freq.begin()->second;// Q ke ordered map hain to sorte rahta hain 
            int key_to_dlt=(koun_sa_list.back())[0];
            
            koun_sa_list.pop_back();

            if(koun_sa_list.empty()){
                freq.erase(freq.begin()->first); // map.erase(key)
                 
            }
            freq[1].push_front({key,value,1});
                 mp.erase(key_to_dlt);
                 mp[key]=freq[1].begin();
        }
    }
};

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache* obj = new LFUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */