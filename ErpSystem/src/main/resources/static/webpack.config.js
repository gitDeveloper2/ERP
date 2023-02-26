const path=require('path');
const HtmlWebpackPlugin=require('html-webpack-plugin');
module.exports={
    
    mode: 'development',
    devServer: {
        static: path.resolve(__dirname,'./dist'),
        open: true
    },
    entry: {
        index: path.resolve(__dirname, './src/index.js')
    },
    output: {
        path: path.resolve(__dirname, './dist'),
        filename: '[name].bundle.js',
        clean:true
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: path.resolve(__dirname,'./src/index.html')
        })
    

    ],
    module:{
        rules:[
            {
                test:/\.(?:ico|gif|png|jpg|jpeg)$/i,
                type: 'asset/resource'
            },
            {
                test: /\.(scss)$/,
                use: [
                    {
                        loader: 'style-loader'
                    },
                    {
                        loader: 'css-loader'
                    },
                    
                    {
                        loader: 'sass-loader'
                    }
                ]
            }
        ]

    }
}









