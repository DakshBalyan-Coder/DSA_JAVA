import hashlib
import json
def crypto_hash(*args):
    stringified_args = sorted(map(lambda data: json.dumps(data),args))
    
    
    #stringified_data = json.dumps(data)
    # sorted_data = sorted(stringified_data)
    joined_data = "".join(stringified_args)
   
    return hashlib.sha256(joined_data.encode("utf-8")).hexdigest()
     
   
    #return stringified_data


print(f'Hatake:{crypto_hash(24,"Daksh",0.15)}')

    