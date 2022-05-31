{
    "type": "array",
    "items": {
        "type": "object",
        "properties": {
            "name": {
                "type": ["number","string"]
            },
            "alternate_names": {
                "type": "array"
            },
            "species": {
                "type": ["number","string"]
            },
            "gender": {
                "type": ["number","string"]
            },
            "house": {
                "type": ["number","string"]
            },
            "dateOfBirth": {
                "type": ["number","string"]
            },
            "yearOfBirth": {
                "type": [
                    "number",
                    "string"
                ]
            },
            "wizard": {
                "type": "boolean"
            },
            "ancestry": {
                "type": ["number","string"]
            },
            "eyeColour": {
                "type": ["number","string"]
            },
            "hairColour": {
                "type": ["number","string"]
            },
            "wand": {
                "type": "object",
                "properties": {
                    "wood": {
                        "type": ["number","string"]
                    },
                    "core": {
                        "type": ["number","string"]
                    },
                    "length": {
                        "type": ["number","string"]
                    }
                }
            },
            "patronus": {
                "type": ["number","string"]
            },
            "hogwartsStudent": {
                "type": "boolean"
            },
            "hogwartsStaff": {
                "type": "boolean"
            },
            "actor": {
                "type": ["number","string"]
            },
            "alternate_actors": {
                "type": "array"
            },
            "alive": {
                "type": "boolean"
            },
            "image": {
                "type": ["number","string"]
            }
        },
        "required": [
            "name",
            "alternate_names",
            "species",
            "gender",
            "house",
            "dateOfBirth",
            "yearOfBirth",
            "wizard",
            "ancestry",
            "eyeColour",
            "hairColour",
            "wand",
            "patronus",
            "hogwartsStudent",
            "hogwartsStaff",
            "actor",
            "alternate_actors",
            "alive",
            "image"
        ]
    }
}