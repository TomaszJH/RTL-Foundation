#Lazy Approach to generating json files, use at own risk
item_list = [
    "copper_ingot",
    "aluminum_ingot",
    "tin_ingot",
    "silver_ingot",
    "nickel_ingot",
    "lead_ingot",
    "boron_ingot",
    "steel_ingot",
    "copper_nugget",
    "aluminum_nugget",
    "tin_nugget",
    "silver_nugget",
    "nickel_nugget",
    "lead_nugget",
    "boron_nugget",
    "steel_nugget"
]

for x in item_list:
    f = open(x + ".json", "w")
    f.write('''{
    "parent": "item/generated",
    "textures": {
        "layer0": "rtl_foundation:item/'''+ x +'''"
    }
}''')
    f.close
