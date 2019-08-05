job('test-job2') {
  
    steps {
        shell('''#!/bin/bash \
        pwd \
        echo "welcome" \
        ''')
    }
}
